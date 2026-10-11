.class public final synthetic Lax/i1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/i1/F$c;


# instance fields
.field public final synthetic a:Lax/i1/h;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lax/i1/h;Ljava/lang/Object;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/i1/g;->a:Lax/i1/h;

    iput-object p2, p0, Lax/i1/g;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lax/i1/F;Lax/P0/N;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/i1/g;->a:Lax/i1/h;

    iget-object v1, p0, Lax/i1/g;->b:Ljava/lang/Object;

    invoke-static {v0, v1, p1, p2}, Lax/i1/h;->D(Lax/i1/h;Ljava/lang/Object;Lax/i1/F;Lax/P0/N;)V

    return-void
.end method
