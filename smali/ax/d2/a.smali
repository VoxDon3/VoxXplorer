.class public final synthetic Lax/d2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/D/c$c;


# instance fields
.field public final synthetic a:Lax/Qb/Q;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lax/Qb/Q;Ljava/lang/Object;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/d2/a;->a:Lax/Qb/Q;

    iput-object p2, p0, Lax/d2/a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lax/D/c$a;)Ljava/lang/Object;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d2/a;->a:Lax/Qb/Q;

    iget-object v1, p0, Lax/d2/a;->b:Ljava/lang/Object;

    invoke-static {v0, v1, p1}, Lax/d2/b;->a(Lax/Qb/Q;Ljava/lang/Object;Lax/D/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
