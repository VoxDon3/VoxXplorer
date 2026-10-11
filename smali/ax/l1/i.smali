.class public final synthetic Lax/l1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/l1/n$j$a;


# instance fields
.field public final synthetic a:Lax/l1/n;

.field public final synthetic b:Lax/l1/n$e;

.field public final synthetic c:Z

.field public final synthetic d:[I


# direct methods
.method public synthetic constructor <init>(Lax/l1/n;Lax/l1/n$e;Z[I)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/l1/i;->a:Lax/l1/n;

    iput-object p2, p0, Lax/l1/i;->b:Lax/l1/n$e;

    iput-boolean p3, p0, Lax/l1/i;->c:Z

    iput-object p4, p0, Lax/l1/i;->d:[I

    return-void
.end method


# virtual methods
.method public final a(ILax/P0/P;[I)Ljava/util/List;
    .registers 11

    .line 1
    iget-object v0, p0, Lax/l1/i;->a:Lax/l1/n;

    iget-object v1, p0, Lax/l1/i;->b:Lax/l1/n$e;

    iget-boolean v2, p0, Lax/l1/i;->c:Z

    iget-object v3, p0, Lax/l1/i;->d:[I

    move v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, Lax/l1/n;->s(Lax/l1/n;Lax/l1/n$e;Z[IILax/P0/P;[I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
